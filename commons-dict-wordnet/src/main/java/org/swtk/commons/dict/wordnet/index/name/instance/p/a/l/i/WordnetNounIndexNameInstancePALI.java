package org.swtk.commons.dict.wordnet.index.name.instance.p.a.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePALI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pali\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06985994\"]}");
	add("{\"term\":\"palilalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14354542\"]}");
	add("{\"term\":\"palimony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13304508\"]}");
	add("{\"term\":\"palimpsest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06419157\"]}");
	add("{\"term\":\"palindrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06305609\"]}");
	add("{\"term\":\"paling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03936551\"]}");
	add("{\"term\":\"palingenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13552855\"]}");
	add("{\"term\":\"palinuridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01987057\"]}");
	add("{\"term\":\"palinurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01987188\"]}");
	add("{\"term\":\"palisade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03884660\"]}");
	add("{\"term\":\"paliurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13164403\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }