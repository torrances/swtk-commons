package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clap\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07394563\", \"14157025\", \"07390857\"]}");
	add("{\"term\":\"clapboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15127574\"]}");
	add("{\"term\":\"clapper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03041213\", \"05308571\", \"09945546\"]}");
	add("{\"term\":\"clapperboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03041389\"]}");
	add("{\"term\":\"clappers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02872589\"]}");
	add("{\"term\":\"clapping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06704734\"]}");
	add("{\"term\":\"claptrap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07101969\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }