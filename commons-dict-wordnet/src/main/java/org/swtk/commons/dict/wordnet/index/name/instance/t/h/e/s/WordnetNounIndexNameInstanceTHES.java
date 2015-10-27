package org.swtk.commons.dict.wordnet.index.name.instance.t.h.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thesaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06432659\"]}");
	add("{\"term\":\"theseus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09616590\"]}");
	add("{\"term\":\"thesis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06420728\", \"06768165\"]}");
	add("{\"term\":\"thespesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12208637\"]}");
	add("{\"term\":\"thespian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09784701\"]}");
	add("{\"term\":\"thespis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11358662\"]}");
	add("{\"term\":\"thessalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08807822\"]}");
	add("{\"term\":\"thessalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10727265\"]}");
	add("{\"term\":\"thessalonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10727356\"]}");
	add("{\"term\":\"thessalonica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08807457\"]}");
	add("{\"term\":\"thessaloniki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08807457\"]}");
	add("{\"term\":\"thessaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08807822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }