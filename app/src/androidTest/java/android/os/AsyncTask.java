package android.os;

public abstract class AsyncTask<Params, Progress, Result> {
    Result result;
    protected abstract Result doInBackground(Params... params);

    protected void onPostExecute(Result result) {
    }


    public AsyncTask<Params, Progress, Result> execute(Params... params) {
        result = doInBackground(params);
        onPostExecute(result);
        return this;
    }
    public Result get(){
        return result;
    }
}
