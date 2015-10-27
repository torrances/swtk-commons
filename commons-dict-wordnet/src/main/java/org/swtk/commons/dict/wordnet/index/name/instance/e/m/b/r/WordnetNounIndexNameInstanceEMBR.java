package org.swtk.commons.dict.wordnet.index.name.instance.e.m.b.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMBR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"embrace\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00181619\", \"14450812\", \"00418410\"]}");
	add("{\"term\":\"embracement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418410\"]}");
	add("{\"term\":\"embracing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418410\"]}");
	add("{\"term\":\"embrasure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03991266\"]}");
	add("{\"term\":\"embrocation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03678920\"]}");
	add("{\"term\":\"embroiderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071360\"]}");
	add("{\"term\":\"embroideress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071491\"]}");
	add("{\"term\":\"embroidery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03287844\", \"07187630\"]}");
	add("{\"term\":\"embroilment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13959186\"]}");
	add("{\"term\":\"embryo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01461483\", \"11706972\"]}");
	add("{\"term\":\"embryologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071569\"]}");
	add("{\"term\":\"embryology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06080976\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }