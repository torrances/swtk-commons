package org.swtk.commons.dict.wordnet.index.name.instance.p.a.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePACK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pack\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"03876350\", \"03876500\", \"03876658\", \"08011383\", \"08257554\", \"08260983\", \"03876224\", \"07973040\", \"13797293\"]}");
	add("{\"term\":\"package\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06578068\", \"03876761\", \"08024575\"]}");
	add("{\"term\":\"packaging\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03877202\", \"07261731\", \"01105693\"]}");
	add("{\"term\":\"packer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09849875\", \"10324172\", \"10410126\"]}");
	add("{\"term\":\"packera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12020427\"]}");
	add("{\"term\":\"packet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03715618\", \"03877306\", \"07295804\", \"08024575\"]}");
	add("{\"term\":\"packhorse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02389398\"]}");
	add("{\"term\":\"packing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00320138\", \"00323054\", \"15001007\"]}");
	add("{\"term\":\"packinghouse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03877538\", \"03877694\"]}");
	add("{\"term\":\"packman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10431296\"]}");
	add("{\"term\":\"packrat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02342574\", \"10410299\"]}");
	add("{\"term\":\"packsack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02772753\"]}");
	add("{\"term\":\"packsaddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03877951\"]}");
	add("{\"term\":\"packthread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03878064\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }