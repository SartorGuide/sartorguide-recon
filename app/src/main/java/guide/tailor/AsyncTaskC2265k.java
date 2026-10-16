package guide.tailor;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class AsyncTaskC2265k extends AsyncTask<Void, Void, Boolean> {
    private final String f10143a = "POST event-api";

    AsyncTaskC2265k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voidArr) {
        while (!C2261g.f9796b) {
            while (C2261g.f9795a.size() > 0 && !C2261g.f9796b) {
                try {
                    String str = "event/data";
                    if (C2261g.f9795a.get(0).f10145b == 1) {
                        str = "event/";
                    } else if (C2261g.f9795a.get(0).f10145b == 2) {
                        str = "pageview/";
                    }
                    JSONObject jSONObject = new JSONObject(C2261g.f9795a.get(0).f10144a);
                    if (WebStart.f9376A) {
                        System.out.println("Event: " + jSONObject.toString());
                    }
                    String m10968a = m10968a("https://event-api.tailor.guide/v2/" + str, jSONObject);
                    if (WebStart.f9376A) {
                        System.out.println("Event response: " + m10968a);
                    }
                    if (m10968a != "") {
                        C2261g.f9795a.remove(0);
                    }
                } catch (Exception e) {
                }
            }
            for (int i = 0; i < 100 && !C2261g.f9796b; i++) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        if (WebStart.f9376A) {
            System.out.println("DEBUG - event closing");
        }
        C2261g.f9797c = false;
        C2261g.f9796b = false;
        return true;
    }

    public String m10968a(String str, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        int responseCode = 0;
        String str2 = "";
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.getOutputStream().write(jSONObject.toString().getBytes("UTF-8"));
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception e) {
        }
        if (responseCode == 200) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            str2 = str2 + readLine;
                        } else {
                            return str2;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            if (responseCode == 400) {
                return "Parameter validation failed";
            }
            if (String.valueOf(responseCode).startsWith("50")) {
                return "Server side error";
            }
            try {
                Thread.sleep(2000L);
                return "";
            } catch (InterruptedException e4) {
                return "";
            } catch (Exception e22) {
                e22.printStackTrace();
                return "";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        C2261g.f9797c = false;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
    }
}
