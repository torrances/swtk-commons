package org.swtk.commons.dict.wordnet.index.name.instance.d.i.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDICH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dichloride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15041910\"]}");
	add("{\"term\":\"dichlorodiphenyltrichloroethane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14624118\"]}");
	add("{\"term\":\"dichloromethane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15042580\"]}");
	add("{\"term\":\"dichondra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12846903\"]}");
	add("{\"term\":\"dichotomisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00389943\"]}");
	add("{\"term\":\"dichotomization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00389943\"]}");
	add("{\"term\":\"dichotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07956120\"]}");
	add("{\"term\":\"dichroism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11466867\"]}");
	add("{\"term\":\"dichromacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14177098\"]}");
	add("{\"term\":\"dichromasy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14177098\"]}");
	add("{\"term\":\"dichromat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10031313\"]}");
	add("{\"term\":\"dichromate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15038331\"]}");
	add("{\"term\":\"dichromatism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14177098\"]}");
	add("{\"term\":\"dichromatopsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14177098\"]}");
	add("{\"term\":\"dichromia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14177098\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }