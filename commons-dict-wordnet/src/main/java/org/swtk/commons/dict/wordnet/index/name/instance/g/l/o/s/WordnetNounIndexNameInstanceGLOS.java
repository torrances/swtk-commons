package org.swtk.commons.dict.wordnet.index.name.instance.g.l.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gloss\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04685309\", \"04962337\", \"06432424\", \"06756695\"]}");
	add("{\"term\":\"glossa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05308571\"]}");
	add("{\"term\":\"glossalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14350289\"]}");
	add("{\"term\":\"glossarist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10152407\"]}");
	add("{\"term\":\"glossary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06432424\"]}");
	add("{\"term\":\"glossina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02193925\"]}");
	add("{\"term\":\"glossiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04962337\"]}");
	add("{\"term\":\"glossinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02193615\"]}");
	add("{\"term\":\"glossitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14370314\"]}");
	add("{\"term\":\"glossodia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12083567\"]}");
	add("{\"term\":\"glossodynia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14350289\"]}");
	add("{\"term\":\"glossolalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14092865\"]}");
	add("{\"term\":\"glossopsitta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01823305\"]}");
	add("{\"term\":\"glossoptosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14197690\"]}");
	add("{\"term\":\"glossy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03445933\", \"06608931\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }