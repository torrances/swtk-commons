package org.swtk.commons.dict.wordnet.index.name.instance.s.y.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSYLL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"syllabary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06373177\"]}");
	add("{\"term\":\"syllabication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00391389\"]}");
	add("{\"term\":\"syllabicity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07128199\"]}");
	add("{\"term\":\"syllabification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00391389\"]}");
	add("{\"term\":\"syllable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06315661\"]}");
	add("{\"term\":\"syllabub\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07628767\", \"07933112\"]}");
	add("{\"term\":\"syllabus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06689161\"]}");
	add("{\"term\":\"syllepsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07123342\"]}");
	add("{\"term\":\"syllogiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704606\"]}");
	add("{\"term\":\"syllogism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05787113\"]}");
	add("{\"term\":\"syllogist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704606\"]}");
	add("{\"term\":\"syllogizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704606\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }