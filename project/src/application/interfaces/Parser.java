package application.interfaces;

import org.json.JSONObject;

public interface Parser<T> {

	T parse(JSONObject responseBody);
}
