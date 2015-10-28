package org.swtk.commons.dict.wordnet.indexbyname.instance.i.n.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546876\"]}");
	add("{\"term\":\"innards\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05306487\"]}");
	add("{\"term\":\"innateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04746870\"]}");
	add("{\"term\":\"innersole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03578999\"]}");
	add("{\"term\":\"innervation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05095396\", \"14059838\"]}");
	add("{\"term\":\"inning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15280615\"]}");
	add("{\"term\":\"innings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00458252\"]}");
	add("{\"term\":\"innkeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10206393\"]}");
	add("{\"term\":\"innocence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14013112\", \"14013549\", \"04888025\"]}");
	add("{\"term\":\"innocency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04888228\"]}");
	add("{\"term\":\"innocense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12902391\"]}");
	add("{\"term\":\"innocent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09644529\"]}");
	add("{\"term\":\"innovation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00241051\", \"05641230\", \"03587827\"]}");
	add("{\"term\":\"innovativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05642612\"]}");
	add("{\"term\":\"innovator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10454492\"]}");
	add("{\"term\":\"innsbruck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08866016\"]}");
	add("{\"term\":\"innuendo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07253115\"]}");
	add("{\"term\":\"innumerableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05129684\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }