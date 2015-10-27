package org.swtk.commons.dict.wordnet.index.name.instance.r.a.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRATT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rattail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02528334\"]}");
	add("{\"term\":\"rattan\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04063292\", \"12156909\", \"12607260\"]}");
	add("{\"term\":\"ratter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02097214\", \"10026763\"]}");
	add("{\"term\":\"rattigan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11274940\"]}");
	add("{\"term\":\"ratting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07229654\"]}");
	add("{\"term\":\"rattle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01757378\", \"04063401\", \"07405840\"]}");
	add("{\"term\":\"rattlebox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12540068\"]}");
	add("{\"term\":\"rattler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03399316\", \"01757517\"]}");
	add("{\"term\":\"rattlesnake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01757517\"]}");
	add("{\"term\":\"rattling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07405840\"]}");
	add("{\"term\":\"rattrap\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04063525\", \"04063603\", \"14432689\"]}");
	add("{\"term\":\"rattus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02336020\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }