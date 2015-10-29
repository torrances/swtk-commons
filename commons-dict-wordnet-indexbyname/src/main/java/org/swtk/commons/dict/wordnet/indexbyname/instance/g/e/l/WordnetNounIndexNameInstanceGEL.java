package org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03437578\", \"04455013\", \"14614722\"]}");
	add("{\"term\":\"gelatin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03437578\", \"07659590\", \"14754732\"]}");
	add("{\"term\":\"gelatin dessert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07659853\"]}");
	add("{\"term\":\"gelatine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14754732\"]}");
	add("{\"term\":\"gelatinousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943390\"]}");
	add("{\"term\":\"gelding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02380040\"]}");
	add("{\"term\":\"gelechia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02296212\"]}");
	add("{\"term\":\"gelechia gossypiella\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02296367\", \"02312801\"]}");
	add("{\"term\":\"gelechiid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02296004\"]}");
	add("{\"term\":\"gelechiid moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02296004\"]}");
	add("{\"term\":\"gelechiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02295787\"]}");
	add("{\"term\":\"gelidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05022647\"]}");
	add("{\"term\":\"gelignite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437706\"]}");
	add("{\"term\":\"gelly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437706\"]}");
	add("{\"term\":\"gelsemium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12506316\"]}");
	add("{\"term\":\"gelsemium sempervirens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12506486\"]}");
	add("{\"term\":\"gelt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13406389\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }