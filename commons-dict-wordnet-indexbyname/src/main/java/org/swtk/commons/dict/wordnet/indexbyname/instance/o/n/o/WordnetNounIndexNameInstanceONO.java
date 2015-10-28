package org.swtk.commons.dict.wordnet.indexbyname.instance.o.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceONO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ono\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11235195\"]}");
	add("{\"term\":\"onobrychis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12572586\"]}");
	add("{\"term\":\"onoclea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13219626\"]}");
	add("{\"term\":\"onomancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10397812\"]}");
	add("{\"term\":\"onomancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05785719\"]}");
	add("{\"term\":\"onomasticon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06432216\"]}");
	add("{\"term\":\"onomastics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06188711\"]}");
	add("{\"term\":\"onomatomania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09206429\"]}");
	add("{\"term\":\"onomatopoeia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07119240\"]}");
	add("{\"term\":\"onondaga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06929377\", \"09683826\"]}");
	add("{\"term\":\"ononis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12573163\"]}");
	add("{\"term\":\"onopordon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12019117\"]}");
	add("{\"term\":\"onopordum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12019117\"]}");
	add("{\"term\":\"onosmodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12843044\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }