package org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pronation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00343917\"]}");
	add("{\"term\":\"pronator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05299967\"]}");
	add("{\"term\":\"proneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04950755\"]}");
	add("{\"term\":\"prong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04017303\"]}");
	add("{\"term\":\"prongbuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02432102\"]}");
	add("{\"term\":\"pronghorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02432102\"]}");
	add("{\"term\":\"pronominal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06328344\"]}");
	add("{\"term\":\"pronoun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06336363\"]}");
	add("{\"term\":\"pronouncement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06740365\"]}");
	add("{\"term\":\"pronucleus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05439338\"]}");
	add("{\"term\":\"pronunciamento\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06739973\"]}");
	add("{\"term\":\"pronunciation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07143400\", \"07143654\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }