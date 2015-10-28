package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aphaeresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13454234\"]}");
	add("{\"term\":\"aphagia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14119810\"]}");
	add("{\"term\":\"aphakia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14120914\"]}");
	add("{\"term\":\"aphakic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09817537\"]}");
	add("{\"term\":\"aphanite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14750494\"]}");
	add("{\"term\":\"aphasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14121056\"]}");
	add("{\"term\":\"aphasic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09817685\"]}");
	add("{\"term\":\"aphasmidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01932429\"]}");
	add("{\"term\":\"aphelion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08512918\"]}");
	add("{\"term\":\"apheresis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00651235\", \"13454234\"]}");
	add("{\"term\":\"aphesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13454456\"]}");
	add("{\"term\":\"aphid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02254878\"]}");
	add("{\"term\":\"aphididae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02255081\"]}");
	add("{\"term\":\"aphidoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02254691\"]}");
	add("{\"term\":\"aphis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02255260\"]}");
	add("{\"term\":\"aphonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14423911\"]}");
	add("{\"term\":\"aphorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07167838\"]}");
	add("{\"term\":\"aphorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09817845\"]}");
	add("{\"term\":\"aphriza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02029152\"]}");
	add("{\"term\":\"aphrodisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07503707\"]}");
	add("{\"term\":\"aphrodisiac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02730206\"]}");
	add("{\"term\":\"aphrodite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09577261\"]}");
	add("{\"term\":\"aphrophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02261006\"]}");
	add("{\"term\":\"aphyllanthaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12460633\"]}");
	add("{\"term\":\"aphyllanthes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12460890\"]}");
	add("{\"term\":\"aphyllophorales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13070045\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }