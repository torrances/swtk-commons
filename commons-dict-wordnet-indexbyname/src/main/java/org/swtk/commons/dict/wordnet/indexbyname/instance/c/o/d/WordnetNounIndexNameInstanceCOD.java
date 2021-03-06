package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cod\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02525030\", \"07805039\", \"13160826\"]}");
	add("{\"term\":\"cod liver oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14840037\"]}");
	add("{\"term\":\"cod oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14840234\"]}");
	add("{\"term\":\"coda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07053224\"]}");
	add("{\"term\":\"codariocalyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12538325\"]}");
	add("{\"term\":\"codariocalyx motorius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12538518\"]}");
	add("{\"term\":\"coddled egg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07857471\"]}");
	add("{\"term\":\"coddler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10415089\"]}");
	add("{\"term\":\"code\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06367301\", \"06365341\", \"06680062\"]}");
	add("{\"term\":\"code flag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06888442\"]}");
	add("{\"term\":\"code of behavior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05675939\"]}");
	add("{\"term\":\"code of conduct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05675939\"]}");
	add("{\"term\":\"codefendant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09952869\"]}");
	add("{\"term\":\"codeine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03066464\"]}");
	add("{\"term\":\"coder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10500853\"]}");
	add("{\"term\":\"codetalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09953071\"]}");
	add("{\"term\":\"codex\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06419015\", \"06501551\"]}");
	add("{\"term\":\"codfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02525030\", \"07805039\"]}");
	add("{\"term\":\"codfish ball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07881551\"]}");
	add("{\"term\":\"codfish cake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07881551\"]}");
	add("{\"term\":\"codger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09953300\"]}");
	add("{\"term\":\"codiaeum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12944199\"]}");
	add("{\"term\":\"codiaeum variegatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12944412\"]}");
	add("{\"term\":\"codicil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06556648\"]}");
	add("{\"term\":\"codification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06680062\", \"01011449\"]}");
	add("{\"term\":\"coding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00615776\"]}");
	add("{\"term\":\"coding dna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14855162\"]}");
	add("{\"term\":\"coding system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06365164\"]}");
	add("{\"term\":\"codlin moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02287831\"]}");
	add("{\"term\":\"codling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02525268\"]}");
	add("{\"term\":\"codling moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02287831\"]}");
	add("{\"term\":\"codon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14840571\"]}");
	add("{\"term\":\"codpiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03066654\"]}");
	add("{\"term\":\"codswallop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06624351\"]}");
	add("{\"term\":\"cody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10924022\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }