package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fumaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11929822\"]}");
	add("{\"term\":\"fumariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11929517\"]}");
	add("{\"term\":\"fumble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00076732\"]}");
	add("{\"term\":\"fumbler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09899210\"]}");
	add("{\"term\":\"fume\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11528510\"]}");
	add("{\"term\":\"fumeroot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11925212\", \"11929996\"]}");
	add("{\"term\":\"fumes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14861534\"]}");
	add("{\"term\":\"fumewort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11925212\", \"11929996\"]}");
	add("{\"term\":\"fumigant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14900357\"]}");
	add("{\"term\":\"fumigation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00714231\"]}");
	add("{\"term\":\"fumigator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03407700\", \"10135497\"]}");
	add("{\"term\":\"fumitory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11929996\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }