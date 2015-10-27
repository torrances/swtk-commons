package org.swtk.commons.dict.wordnet.index.name.instance.m.e.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mend\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00267650\", \"03750776\"]}");
	add("{\"term\":\"mendacity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04883430\"]}");
	add("{\"term\":\"mendel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11193189\"]}");
	add("{\"term\":\"mendeleev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11193465\"]}");
	add("{\"term\":\"mendelevium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14669270\"]}");
	add("{\"term\":\"mendeleyev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11193465\"]}");
	add("{\"term\":\"mendelian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10328320\"]}");
	add("{\"term\":\"mendelianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06119579\"]}");
	add("{\"term\":\"mendelism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06119579\"]}");
	add("{\"term\":\"mendelsohn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11193768\"]}");
	add("{\"term\":\"mendelssohn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11193907\"]}");
	add("{\"term\":\"mender\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10328399\"]}");
	add("{\"term\":\"mendicancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07202656\", \"14517616\"]}");
	add("{\"term\":\"mendicant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09866418\", \"10131672\"]}");
	add("{\"term\":\"mendicity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14517616\"]}");
	add("{\"term\":\"mending\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00267650\", \"03750978\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }