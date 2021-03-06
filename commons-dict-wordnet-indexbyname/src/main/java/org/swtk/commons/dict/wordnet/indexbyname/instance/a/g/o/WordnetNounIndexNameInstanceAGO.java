package org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"agon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00036418\"]}");
	add("{\"term\":\"agonic line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08507695\"]}");
	add("{\"term\":\"agonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02650133\"]}");
	add("{\"term\":\"agonist\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02687648\", \"05300767\", \"09798721\", \"10192465\"]}");
	add("{\"term\":\"agonus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02650533\"]}");
	add("{\"term\":\"agonus cataphractus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02650665\"]}");
	add("{\"term\":\"agony\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14347683\", \"07510691\"]}");
	add("{\"term\":\"agony aunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09798902\"]}");
	add("{\"term\":\"agony column\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06282167\"]}");
	add("{\"term\":\"agora\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02687821\", \"08509471\", \"13728520\"]}");
	add("{\"term\":\"agoraphobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14405245\"]}");
	add("{\"term\":\"agouti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368654\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }