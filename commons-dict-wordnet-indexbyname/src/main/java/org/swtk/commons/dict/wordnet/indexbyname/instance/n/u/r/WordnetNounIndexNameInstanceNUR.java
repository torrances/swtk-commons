package org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nuremberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08792207\"]}");
	add("{\"term\":\"nureyev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11230600\"]}");
	add("{\"term\":\"nurnberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08792207\"]}");
	add("{\"term\":\"nurse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10364831\", \"10386665\"]}");
	add("{\"term\":\"nurse clinician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10387518\"]}");
	add("{\"term\":\"nurse log\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14989100\"]}");
	add("{\"term\":\"nurse practitioner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10387518\"]}");
	add("{\"term\":\"nurse shark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489479\"]}");
	add("{\"term\":\"nurseling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10387990\"]}");
	add("{\"term\":\"nursemaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10364831\"]}");
	add("{\"term\":\"nurser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10387108\"]}");
	add("{\"term\":\"nursery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03841582\"]}");
	add("{\"term\":\"nursery rhyme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07237388\"]}");
	add("{\"term\":\"nursery school\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08429222\"]}");
	add("{\"term\":\"nurseryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10140190\"]}");
	add("{\"term\":\"nursing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01060794\", \"08129942\", \"00666322\"]}");
	add("{\"term\":\"nursing aide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10387247\"]}");
	add("{\"term\":\"nursing bottle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02880508\"]}");
	add("{\"term\":\"nursing care\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00666240\"]}");
	add("{\"term\":\"nursing home\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03533280\"]}");
	add("{\"term\":\"nursing school\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08300678\"]}");
	add("{\"term\":\"nursling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10387990\"]}");
	add("{\"term\":\"nurturance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00666601\"]}");
	add("{\"term\":\"nurture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01131853\", \"04929290\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }