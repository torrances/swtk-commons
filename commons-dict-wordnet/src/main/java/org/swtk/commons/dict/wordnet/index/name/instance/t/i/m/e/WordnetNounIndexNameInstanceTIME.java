package org.swtk.commons.dict.wordnet.index.name.instance.t.i.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"time\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"15249488\", \"04998860\", \"15160774\", \"15154879\", \"07302920\", \"00028468\", \"15270326\", \"15147173\", \"15295388\", \"07324217\"]}");
	add("{\"term\":\"timecard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04444265\", \"06516829\"]}");
	add("{\"term\":\"timekeeper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04445087\", \"10731019\", \"10731132\"]}");
	add("{\"term\":\"timekeeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15198759\"]}");
	add("{\"term\":\"timelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13980191\"]}");
	add("{\"term\":\"timeline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06516956\"]}");
	add("{\"term\":\"timeliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04726102\", \"05056404\"]}");
	add("{\"term\":\"timepiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04445087\"]}");
	add("{\"term\":\"timer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04445641\", \"10731132\", \"04445438\"]}");
	add("{\"term\":\"times\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00873254\", \"15145288\"]}");
	add("{\"term\":\"timeserver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10731290\"]}");
	add("{\"term\":\"timetable\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06508388\", \"06508490\"]}");
	add("{\"term\":\"timework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00797286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }