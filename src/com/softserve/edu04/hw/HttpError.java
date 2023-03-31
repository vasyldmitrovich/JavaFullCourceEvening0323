package com.softserve.edu04.hw;

public enum HttpError {
	N400("Bad request"), N401("Unauthorized"), N402("Payment required"), N403("Forbidden"),
	N404("Not found"), N405("Method not allowed"), N406("Not acceptable"),
	N407("Proxy authentication required"), N408("Request timeout"), N409("Conflict"),
	N410("Gone"), N411("Length required"), N412("Precondition Failed"),
	N413("Payload too large"), N414("URI too long"), N415("Unsupported media type"),
	N416("Range not satisfiable"), N417("Expectation failed"), N418("I'm a teapot"),
	N421("Misdirected request"), N422("Unprocessable entity"), N423("Locked"),
	N424("Failed dependency"), N425("Too early"), N426("Upgrade required"),
	N428("Precondition required"), N429("Too many requests"), N431("Request header fields too large"),
	N451("Unavailable for legal reasons");
	
	private final String name;
	
	HttpError(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getErrorName(int code) {
		HttpError httpError = HttpError.N400;
		switch (code) {
			case 400:
				break;
			case 401:
				httpError = HttpError.N401;
				break;
			case 402:
				httpError = HttpError.N402;
				break;
			case 403:
				httpError = HttpError.N403;
				break;
			case 404:
				httpError = HttpError.N404;
				break;
			case 405:
				httpError = HttpError.N405;
				break;
			case 406:
				httpError = HttpError.N406;
				break;
			case 407:
				httpError = HttpError.N407;
				break;
			case 408:
				httpError = HttpError.N408;
				break;
			case 409:
				httpError = HttpError.N409;
				break;
			case 410:
				httpError = HttpError.N410;
				break;
			case 411:
				httpError = HttpError.N411;
				break;
			case 412:
				httpError = HttpError.N412;
				break;
			case 413:
				httpError = HttpError.N413;
				break;
			case 414:
				httpError = HttpError.N414;
				break;
			case 415:
				httpError = HttpError.N415;
				break;
			case 416:
				httpError = HttpError.N416;
				break;
			case 417:
				httpError = HttpError.N417;
				break;
			case 418:
				httpError = HttpError.N418;
				break;
			case 421:
				httpError = HttpError.N421;
				break;
			case 422:
				httpError = HttpError.N422;
				break;
			case 423:
				httpError = HttpError.N423;
				break;
			case 424:
				httpError = HttpError.N424;
				break;
			case 425:
				httpError = HttpError.N425;
				break;
			case 426:
				httpError = HttpError.N426;
				break;
			case 428:
				httpError = HttpError.N428;
				break;
			case 429:
				httpError = HttpError.N429;
				break;
			case 431:
				httpError = HttpError.N431;
				break;
			case 451:
				httpError = HttpError.N451;
				break;
			default:
				System.out.println("Wrong error code number");
				break;
		}
		return httpError.getName();
	}
}
