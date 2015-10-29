package org.swtk.commons.dict.wordnet.indexbyname.instance.c.y.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cylinder\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03160945\", \"03161071\", \"13922497\", \"13887919\"]}");
	add("{\"term\":\"cylinder block\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03293136\"]}");
	add("{\"term\":\"cylinder head\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03161272\"]}");
	add("{\"term\":\"cylinder lock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03161433\"]}");
	add("{\"term\":\"cylinder press\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03365277\"]}");
	add("{\"term\":\"cylindrical lining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02928491\"]}");
	add("{\"term\":\"cylindricality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05080572\"]}");
	add("{\"term\":\"cylindricalness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05080572\"]}");
	add("{\"term\":\"cylix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03634811\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }