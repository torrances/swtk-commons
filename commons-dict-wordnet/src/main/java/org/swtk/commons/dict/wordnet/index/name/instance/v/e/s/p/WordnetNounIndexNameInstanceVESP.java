package org.swtk.commons.dict.wordnet.index.name.instance.v.e.s.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVESP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vespa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02215463\"]}");
	add("{\"term\":\"vespasian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11384794\"]}");
	add("{\"term\":\"vesper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01036603\", \"09299778\"]}");
	add("{\"term\":\"vespers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15254976\"]}");
	add("{\"term\":\"vespertilio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02148419\"]}");
	add("{\"term\":\"vespertilionid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02148076\"]}");
	add("{\"term\":\"vespertilionidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02147736\"]}");
	add("{\"term\":\"vespid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02215254\"]}");
	add("{\"term\":\"vespidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02214975\"]}");
	add("{\"term\":\"vespucci\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11385095\"]}");
	add("{\"term\":\"vespula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02216014\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }