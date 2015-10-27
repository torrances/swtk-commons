package org.swtk.commons.dict.wordnet.index.name.instance.d.y.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDYNA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dynamic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09202859\"]}");
	add("{\"term\":\"dynamics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06123204\"]}");
	add("{\"term\":\"dynamism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04642839\", \"05037972\", \"05969792\"]}");
	add("{\"term\":\"dynamite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03264996\"]}");
	add("{\"term\":\"dynamiter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10060597\"]}");
	add("{\"term\":\"dynamitist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10060597\"]}");
	add("{\"term\":\"dynamo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03265207\"]}");
	add("{\"term\":\"dynamometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03265436\"]}");
	add("{\"term\":\"dynapen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03197031\"]}");
	add("{\"term\":\"dynast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10561540\"]}");
	add("{\"term\":\"dynasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07988029\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }