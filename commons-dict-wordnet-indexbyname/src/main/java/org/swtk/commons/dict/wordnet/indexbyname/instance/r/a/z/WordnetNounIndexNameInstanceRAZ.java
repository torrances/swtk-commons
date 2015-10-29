package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"razbliuto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07497508\"]}");
	add("{\"term\":\"razing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00218912\", \"07349697\"]}");
	add("{\"term\":\"razmataz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00564367\"]}");
	add("{\"term\":\"razor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04064159\"]}");
	add("{\"term\":\"razor clam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01961670\"]}");
	add("{\"term\":\"razor edge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04064435\"]}");
	add("{\"term\":\"razor fish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02612247\"]}");
	add("{\"term\":\"razorback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02066991\", \"02398809\"]}");
	add("{\"term\":\"razorback hog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02398809\"]}");
	add("{\"term\":\"razorbacked hog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02398809\"]}");
	add("{\"term\":\"razorbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02048518\"]}");
	add("{\"term\":\"razorblade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04064327\"]}");
	add("{\"term\":\"razz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07138578\"]}");
	add("{\"term\":\"razzing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07138578\"]}");
	add("{\"term\":\"razzle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00564367\"]}");
	add("{\"term\":\"razzmatazz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00564367\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }