package org.swtk.commons.dict.wordnet.index.name.instance.r.e.s.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRESP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"respect\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04921016\", \"07560785\", \"01135185\", \"01231366\", \"06216535\", \"14461018\", \"05828314\"]}");
	add("{\"term\":\"respectability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04878197\"]}");
	add("{\"term\":\"respecter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10543816\"]}");
	add("{\"term\":\"respectfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04921016\"]}");
	add("{\"term\":\"respects\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06727491\"]}");
	add("{\"term\":\"respighi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11278204\"]}");
	add("{\"term\":\"respiration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00832852\", \"00833443\", \"00832472\"]}");
	add("{\"term\":\"respirator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03429235\", \"04087945\"]}");
	add("{\"term\":\"respite\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01261714\", \"15299060\", \"07382856\", \"01064921\", \"14469500\"]}");
	add("{\"term\":\"resplendence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04691697\"]}");
	add("{\"term\":\"resplendency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04691697\"]}");
	add("{\"term\":\"respondent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10544006\", \"10544304\"]}");
	add("{\"term\":\"responder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10544006\"]}");
	add("{\"term\":\"response\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"05220076\", \"07214225\", \"06397225\", \"06643359\", \"06758700\", \"00860679\", \"11437102\"]}");
	add("{\"term\":\"responsibility\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04676604\", \"14539235\", \"01132241\"]}");
	add("{\"term\":\"responsibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04676604\"]}");
	add("{\"term\":\"responsiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05220241\", \"05661420\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }