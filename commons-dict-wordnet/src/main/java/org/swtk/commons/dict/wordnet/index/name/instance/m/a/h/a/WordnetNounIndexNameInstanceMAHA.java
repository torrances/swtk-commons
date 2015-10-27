package org.swtk.commons.dict.wordnet.index.name.instance.m.a.h.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAHA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"maha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09683333\"]}");
	add("{\"term\":\"mahabharata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06443166\"]}");
	add("{\"term\":\"mahabharatam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06443166\"]}");
	add("{\"term\":\"mahabharatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06443166\"]}");
	add("{\"term\":\"mahagua\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12199011\", \"12200685\"]}");
	add("{\"term\":\"mahan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11169473\"]}");
	add("{\"term\":\"maharaja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301334\"]}");
	add("{\"term\":\"maharajah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301334\"]}");
	add("{\"term\":\"maharanee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301467\"]}");
	add("{\"term\":\"maharani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301467\"]}");
	add("{\"term\":\"maharashtra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08925719\"]}");
	add("{\"term\":\"mahatma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10301593\"]}");
	add("{\"term\":\"mahayana\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06250995\", \"08116230\"]}");
	add("{\"term\":\"mahayanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06198976\"]}");
	add("{\"term\":\"mahayanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09703460\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }