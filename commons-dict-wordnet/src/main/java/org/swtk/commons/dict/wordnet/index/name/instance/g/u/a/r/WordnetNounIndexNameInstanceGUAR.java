package org.swtk.commons.dict.wordnet.index.name.instance.g.u.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12540911\"]}");
	add("{\"term\":\"guarani\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06930056\", \"09714653\", \"13701713\"]}");
	add("{\"term\":\"guarantee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13374019\", \"06698919\", \"06698201\"]}");
	add("{\"term\":\"guarantor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10169047\"]}");
	add("{\"term\":\"guaranty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13374019\"]}");
	add("{\"term\":\"guard\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00726924\", \"00729041\", \"00731836\", \"00824631\", \"08232524\", \"10169801\", \"05089429\", \"03469399\", \"10169240\", \"10169591\"]}");
	add("{\"term\":\"guardhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03469689\"]}");
	add("{\"term\":\"guardian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09637714\"]}");
	add("{\"term\":\"guardianship\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00820127\", \"00831039\"]}");
	add("{\"term\":\"guardrail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04134496\"]}");
	add("{\"term\":\"guardroom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03469884\", \"03469972\"]}");
	add("{\"term\":\"guardsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10169935\"]}");
	add("{\"term\":\"guarneri\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11037827\", \"11037983\"]}");
	add("{\"term\":\"guarnerius\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03470432\", \"11037827\", \"11037983\"]}");
	add("{\"term\":\"guarnieri\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11037827\", \"11037983\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }