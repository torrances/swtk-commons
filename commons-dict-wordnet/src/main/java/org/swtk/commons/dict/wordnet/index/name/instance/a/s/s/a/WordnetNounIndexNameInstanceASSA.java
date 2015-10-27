package org.swtk.commons.dict.wordnet.index.name.instance.a.s.s.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASSA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"assagai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02752675\"]}");
	add("{\"term\":\"assailability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05050503\"]}");
	add("{\"term\":\"assailant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09840655\"]}");
	add("{\"term\":\"assam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08922286\"]}");
	add("{\"term\":\"assamese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06983458\", \"09693311\"]}");
	add("{\"term\":\"assassin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09833489\", \"09833101\"]}");
	add("{\"term\":\"assassination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00221923\", \"06732723\"]}");
	add("{\"term\":\"assassinator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09833101\"]}");
	add("{\"term\":\"assault\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00774891\", \"02386877\", \"00769315\", \"00976530\"]}");
	add("{\"term\":\"assaulter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09840655\"]}");
	add("{\"term\":\"assay\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00793188\", \"07233822\", \"14608570\", \"05746570\"]}");
	add("{\"term\":\"assayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09833657\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }