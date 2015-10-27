package org.swtk.commons.dict.wordnet.index.name.instance.s.p.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPLI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"splice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03647887\", \"04289136\"]}");
	add("{\"term\":\"splicer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04289369\", \"10656627\", \"10656758\"]}");
	add("{\"term\":\"splicing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04289136\"]}");
	add("{\"term\":\"spliff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03606019\"]}");
	add("{\"term\":\"spline\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04241561\", \"04289517\"]}");
	add("{\"term\":\"splint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04289632\", \"09465627\"]}");
	add("{\"term\":\"splinter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09465742\"]}");
	add("{\"term\":\"splintering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00377977\"]}");
	add("{\"term\":\"splinters\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14973213\"]}");
	add("{\"term\":\"split\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00387484\", \"00392215\", \"00439983\", \"04289802\", \"07632199\", \"08836868\", \"09433806\", \"09466040\", \"13307663\", \"13792216\", \"00438869\"]}");
	add("{\"term\":\"splitsaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04101702\"]}");
	add("{\"term\":\"splitsville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00216401\"]}");
	add("{\"term\":\"splitter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10524799\", \"10657033\", \"10657237\"]}");
	add("{\"term\":\"splitworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02297059\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }