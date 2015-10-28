package org.swtk.commons.dict.wordnet.indexbyname.instance.b.e.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"behalf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05150547\", \"00722912\"]}");
	add("{\"term\":\"behavior\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01223743\", \"04904939\", \"14031827\", \"01223473\"]}");
	add("{\"term\":\"behaviorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06149215\"]}");
	add("{\"term\":\"behaviorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09631550\"]}");
	add("{\"term\":\"behaviour\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01223473\", \"01223743\", \"04904939\", \"14031827\"]}");
	add("{\"term\":\"behaviourism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06149215\"]}");
	add("{\"term\":\"behaviourist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09631550\"]}");
	add("{\"term\":\"beheading\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00229048\", \"01167714\"]}");
	add("{\"term\":\"behemoth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09958449\", \"10148446\"]}");
	add("{\"term\":\"behest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07185223\"]}");
	add("{\"term\":\"behind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05566889\"]}");
	add("{\"term\":\"behmen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"behmenism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06197881\"]}");
	add("{\"term\":\"beholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09649777\"]}");
	add("{\"term\":\"beholding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05718807\"]}");
	add("{\"term\":\"behrens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10861476\"]}");
	add("{\"term\":\"behring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10866509\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }