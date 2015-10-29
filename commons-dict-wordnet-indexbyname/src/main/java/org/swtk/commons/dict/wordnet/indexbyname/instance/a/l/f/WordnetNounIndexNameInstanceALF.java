package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"al faran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08039725\"]}");
	add("{\"term\":\"alfalfa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07817755\", \"12569925\"]}");
	add("{\"term\":\"alfalfa sprout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07735501\"]}");
	add("{\"term\":\"alfilaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12709664\"]}");
	add("{\"term\":\"alfileria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12709664\"]}");
	add("{\"term\":\"alfonso borgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10899776\"]}");
	add("{\"term\":\"alfred\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10832978\"]}");
	add("{\"term\":\"alfred alistair cooke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10928508\"]}");
	add("{\"term\":\"alfred bernhard nobel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11228678\"]}");
	add("{\"term\":\"alfred binet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10870878\"]}");
	add("{\"term\":\"alfred charles kinsey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11125599\"]}");
	add("{\"term\":\"alfred charles william harmsworth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11049294\"]}");
	add("{\"term\":\"alfred damon runyon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11293897\"]}");
	add("{\"term\":\"alfred de musset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11218084\"]}");
	add("{\"term\":\"alfred dreyfus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10963397\"]}");
	add("{\"term\":\"alfred edward housman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11081729\"]}");
	add("{\"term\":\"alfred edward woodley mason\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11182905\"]}");
	add("{\"term\":\"alfred eisenstaedt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10975274\"]}");
	add("{\"term\":\"alfred habdank skarbek korzybski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129553\"]}");
	add("{\"term\":\"alfred hawthorne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11069933\"]}");
	add("{\"term\":\"alfred hitchcock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072294\"]}");
	add("{\"term\":\"alfred joseph hitchcock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072294\"]}");
	add("{\"term\":\"alfred kastler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11117515\"]}");
	add("{\"term\":\"alfred korzybski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129553\"]}");
	add("{\"term\":\"alfred kroeber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11130907\"]}");
	add("{\"term\":\"alfred krupp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11131835\"]}");
	add("{\"term\":\"alfred lord tennyson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355325\"]}");
	add("{\"term\":\"alfred lothar wegener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11399531\"]}");
	add("{\"term\":\"alfred louis kroeber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11130907\"]}");
	add("{\"term\":\"alfred lunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11165189\"]}");
	add("{\"term\":\"alfred nobel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11228678\"]}");
	add("{\"term\":\"alfred north whitehead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11404561\"]}");
	add("{\"term\":\"alfred noyes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11230281\"]}");
	add("{\"term\":\"alfred russel wallace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11391438\"]}");
	add("{\"term\":\"alfred stieglitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11338343\"]}");
	add("{\"term\":\"alfred tennyson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355325\"]}");
	add("{\"term\":\"alfred thayer mahan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11169473\"]}");
	add("{\"term\":\"alfred the great\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10832978\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }