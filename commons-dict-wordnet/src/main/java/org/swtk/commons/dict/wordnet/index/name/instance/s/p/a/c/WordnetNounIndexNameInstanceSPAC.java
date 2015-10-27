package org.swtk.commons.dict.wordnet.index.name.instance.s.p.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"space\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04037131\", \"06875252\", \"06401196\", \"15197259\", \"06852240\", \"08517454\", \"08670545\", \"13933399\", \"00028950\"]}");
	add("{\"term\":\"spacecraft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04272024\"]}");
	add("{\"term\":\"spacefaring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00314328\"]}");
	add("{\"term\":\"spaceflight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00314328\"]}");
	add("{\"term\":\"spaceman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837427\"]}");
	add("{\"term\":\"spaceship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04311353\"]}");
	add("{\"term\":\"spacesuit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04273485\"]}");
	add("{\"term\":\"spacewalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10648691\"]}");
	add("{\"term\":\"spacing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05090535\", \"15307752\"]}");
	add("{\"term\":\"spaciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05112565\"]}");
	add("{\"term\":\"spackle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15073455\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }