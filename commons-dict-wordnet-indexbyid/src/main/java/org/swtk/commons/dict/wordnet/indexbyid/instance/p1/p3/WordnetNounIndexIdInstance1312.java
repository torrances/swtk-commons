package org.swtk.commons.dict.wordnet.indexbyid.instance.p1.p3;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexIdInstance1312 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("13120132", "{\"term\":\"pseudophloem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120132\"]}");
	add("13120203", "{\"term\":\"bast\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09535163\", \"13119721\", \"13120203\"]}");
	add("13120203", "{\"term\":\"bast fiber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120203\"]}");
	add("13120345", "{\"term\":\"gall\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04923043\", \"05413913\", \"07564444\", \"13120345\", \"14207872\", \"14298742\"]}");
	add("13120493", "{\"term\":\"oak apple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120493\"]}");
	add("13120592", "{\"term\":\"evergreen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120592\"]}");
	add("13120592", "{\"term\":\"evergreen plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120592\"]}");
	add("13120758", "{\"term\":\"deciduous plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120758\"]}");
	add("13120915", "{\"term\":\"poisonous plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120915\"]}");
	add("13121436", "{\"term\":\"vine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13121436\"]}");
	add("13123168", "{\"term\":\"climber\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03131036\", \"09948756\", \"10354670\", \"10638201\", \"13123168\"]}");
	add("13123407", "{\"term\":\"creeper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01591927\", \"09995649\", \"13123407\"]}");
	add("13123534", "{\"term\":\"tendril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13123534\"]}");
	add("13123705", "{\"term\":\"cirrhus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13123705\"]}");
	add("13123705", "{\"term\":\"cirrus\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01902982\", \"09268870\", \"13123705\"]}");
	add("13123782", "{\"term\":\"root climber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13123782\"]}");
	add("13123895", "{\"term\":\"ligneous plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13123895\"]}");
	add("13123895", "{\"term\":\"woody plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13123895\"]}");
	add("13124419", "{\"term\":\"lignosae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13124419\"]}");
	add("13124509", "{\"term\":\"arborescent plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13124509\"]}");
	add("13124636", "{\"term\":\"snag\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05699109\", \"09433806\", \"13124636\", \"13918438\"]}");
	add("13124818", "{\"term\":\"tree\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11368155\", \"13935275\", \"13124818\"]}");
	add("13128453", "{\"term\":\"timber tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13128453\"]}");
	add("13128566", "{\"term\":\"treelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13128566\"]}");
	add("13128650", "{\"term\":\"arbor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02735832\", \"04284631\", \"13128650\"]}");
	add("13128890", "{\"term\":\"bean tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13128890\"]}");
	add("13129082", "{\"term\":\"pollard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01321830\", \"13129082\"]}");
	add("13129240", "{\"term\":\"sapling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13129240\"]}");
	add("13129304", "{\"term\":\"shade tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13129304\"]}");
	add("13129421", "{\"term\":\"gymnospermous tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13129421\"]}");
	add("13129600", "{\"term\":\"conifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13129600\"]}");
	add("13129600", "{\"term\":\"coniferous tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13129600\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> ids() { 		return map.keySet(); 	} }