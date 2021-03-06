package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jasmine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12327234\"]}");
	add("{\"term\":\"jasmine tobacco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12928431\"]}");
	add("{\"term\":\"jasminum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12327036\"]}");
	add("{\"term\":\"jasminum mesnyi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12327455\"]}");
	add("{\"term\":\"jasminum nudiflorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12327593\"]}");
	add("{\"term\":\"jasminum officinale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12327757\"]}");
	add("{\"term\":\"jasminum sambac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12327972\"]}");
	add("{\"term\":\"jason\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09615558\"]}");
	add("{\"term\":\"jasper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14949171\"]}");
	add("{\"term\":\"jasper johns\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11107921\"]}");
	add("{\"term\":\"jaspers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11100977\"]}");
	add("{\"term\":\"jassid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02261788\"]}");
	add("{\"term\":\"jassidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02261562\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }