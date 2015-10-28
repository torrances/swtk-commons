package org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"name\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06733713\", \"01141957\", \"10364174\", \"07988726\", \"14462254\", \"06344646\"]}");
	add("{\"term\":\"nameko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13029845\"]}");
	add("{\"term\":\"namelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14459751\"]}");
	add("{\"term\":\"nameplate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03812192\"]}");
	add("{\"term\":\"namer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10364505\"]}");
	add("{\"term\":\"names\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06733533\"]}");
	add("{\"term\":\"namesake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10364653\"]}");
	add("{\"term\":\"namibia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08717468\"]}");
	add("{\"term\":\"namibian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09743233\"]}");
	add("{\"term\":\"naming\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00164600\", \"07245162\"]}");
	add("{\"term\":\"nammad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03841249\"]}");
	add("{\"term\":\"nammu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09542883\"]}");
	add("{\"term\":\"namoi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09387675\"]}");
	add("{\"term\":\"nampa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09104589\"]}");
	add("{\"term\":\"namtar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09543036\"]}");
	add("{\"term\":\"namtaru\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09543036\"]}");
	add("{\"term\":\"namur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08870822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }