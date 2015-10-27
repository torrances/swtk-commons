package org.swtk.commons.dict.wordnet.index.name.instance.o.r.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORNI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ornithine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14631556\"]}");
	add("{\"term\":\"ornithischia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01702717\"]}");
	add("{\"term\":\"ornithischian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01703111\"]}");
	add("{\"term\":\"ornithogalum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12479976\"]}");
	add("{\"term\":\"ornithologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10403913\"]}");
	add("{\"term\":\"ornithology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06083044\"]}");
	add("{\"term\":\"ornithomimid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01718529\"]}");
	add("{\"term\":\"ornithomimida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01718333\"]}");
	add("{\"term\":\"ornithopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01708232\"]}");
	add("{\"term\":\"ornithopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01707888\"]}");
	add("{\"term\":\"ornithopter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03862676\"]}");
	add("{\"term\":\"ornithorhynchidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01875648\"]}");
	add("{\"term\":\"ornithorhynchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01875785\"]}");
	add("{\"term\":\"ornithosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14173255\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }