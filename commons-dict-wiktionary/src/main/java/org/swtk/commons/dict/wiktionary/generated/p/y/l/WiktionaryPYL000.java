package org.swtk.commons.dict.wiktionary.generated.p.y.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPYL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pylon", "{\"term\":\"pylon\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027πυλών\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gateway to the inner part of an Ancient Egyptian temple\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A tower-like structure, usually one of a series, used to support high-voltage electricity cables\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d7|url\u003dhttp://openlibrary.org/works/OL2004261W|passage\u003dThe highway to the East Coast which ran through the borough of Ebbfield had always been a main road and even now, despite the vast garages, the \u0027\u0027pylons\u0027\u0027 and the gaily painted factory glasshouses which had sprung up beside it, there still remained an occasional trace of past cultures\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A structure used to mount engines, missiles etc., to the underside of an aircraft wing or fuselage\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A starting derrick for an aeroplane\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A post, tower, etc. as on an aerodrome, or flying ground, serving to bound or mark a prescribed course of flight\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"An obelisk\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A traffic cone\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"An orange marker designating one of the four corners of the end zone in American thumb||Pylons designating the corners of the end zone\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }