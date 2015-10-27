package org.swtk.commons.dict.wordnet.index.name.instance.p.e.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePEAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pear\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12672372\", \"07783823\"]}");
	add("{\"term\":\"pearl\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13924278\", \"04968508\", \"13393576\"]}");
	add("{\"term\":\"pearler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10430276\"]}");
	add("{\"term\":\"pearlfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02562014\"]}");
	add("{\"term\":\"pearlite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15002404\"]}");
	add("{\"term\":\"pearlweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11834707\"]}");
	add("{\"term\":\"pearlwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11834707\"]}");
	add("{\"term\":\"pearly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05290997\"]}");
	add("{\"term\":\"pearmain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07757333\"]}");
	add("{\"term\":\"peary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11247786\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }