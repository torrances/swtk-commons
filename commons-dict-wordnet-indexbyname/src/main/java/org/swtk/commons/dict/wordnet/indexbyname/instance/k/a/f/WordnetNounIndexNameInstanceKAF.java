package org.swtk.commons.dict.wordnet.indexbyname.instance.k.a.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKAF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kaffir\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10248534\", \"12157854\"]}");
	add("{\"term\":\"kaffir boom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12548614\", \"12549273\"]}");
	add("{\"term\":\"kaffir bread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11623913\"]}");
	add("{\"term\":\"kaffir cat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02128524\"]}");
	add("{\"term\":\"kaffir corn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12157854\"]}");
	add("{\"term\":\"kaffir pox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14148170\"]}");
	add("{\"term\":\"kaffiyeh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03612399\"]}");
	add("{\"term\":\"kafir\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09709027\", \"10248534\"]}");
	add("{\"term\":\"kafir corn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12157854\"]}");
	add("{\"term\":\"kafiri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06985416\"]}");
	add("{\"term\":\"kafka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11115721\"]}");
	add("{\"term\":\"kafocin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03000177\"]}");
	add("{\"term\":\"kaftan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02939786\", \"02939954\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }