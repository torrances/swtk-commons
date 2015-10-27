package org.swtk.commons.dict.wordnet.index.name.instance.b.r.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09893894\", \"02901103\"]}");
	add("{\"term\":\"brickbat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06723899\", \"09252065\"]}");
	add("{\"term\":\"brickellia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11962613\"]}");
	add("{\"term\":\"brickfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02901761\"]}");
	add("{\"term\":\"brickkiln\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02901376\"]}");
	add("{\"term\":\"bricklayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09893984\"]}");
	add("{\"term\":\"bricklaying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00608573\"]}");
	add("{\"term\":\"brickwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02901652\"]}");
	add("{\"term\":\"brickyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02901761\"]}");
	add("{\"term\":\"bricolage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00913288\"]}");
	add("{\"term\":\"bricole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02985366\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }