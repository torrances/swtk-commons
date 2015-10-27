package org.swtk.commons.dict.wordnet.index.name.instance.l.i.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"limp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00287600\"]}");
	add("{\"term\":\"limpa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07701947\"]}");
	add("{\"term\":\"limper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198548\"]}");
	add("{\"term\":\"limpet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01951214\", \"07808616\"]}");
	add("{\"term\":\"limpidity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04709291\", \"04827489\"]}");
	add("{\"term\":\"limping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14573529\"]}");
	add("{\"term\":\"limpkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02016360\"]}");
	add("{\"term\":\"limpness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04946223\"]}");
	add("{\"term\":\"limpopo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09362418\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }