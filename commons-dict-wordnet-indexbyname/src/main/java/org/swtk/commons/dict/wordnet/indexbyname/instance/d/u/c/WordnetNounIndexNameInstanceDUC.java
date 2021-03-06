package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"duc de richelieu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281473\"]}");
	add("{\"term\":\"duc de sully\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11345141\"]}");
	add("{\"term\":\"ducat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13410648\"]}");
	add("{\"term\":\"duce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058045\"]}");
	add("{\"term\":\"duchamp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10964230\"]}");
	add("{\"term\":\"duchess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058134\"]}");
	add("{\"term\":\"duchess of ferrara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10877614\"]}");
	add("{\"term\":\"duchess of windsor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11321804\"]}");
	add("{\"term\":\"duchesse de valentinois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10953680\"]}");
	add("{\"term\":\"duchy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08574668\"]}");
	add("{\"term\":\"duck\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03257774\", \"07662187\", \"13617087\", \"01848972\"]}");
	add("{\"term\":\"duck down\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01899376\"]}");
	add("{\"term\":\"duck hunter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058272\"]}");
	add("{\"term\":\"duck hunting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454420\"]}");
	add("{\"term\":\"duck pate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07874090\"]}");
	add("{\"term\":\"duck sauce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07840244\"]}");
	add("{\"term\":\"duck shot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02847015\"]}");
	add("{\"term\":\"duck soup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00576402\"]}");
	add("{\"term\":\"duckbill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01875951\", \"02642235\"]}");
	add("{\"term\":\"duckbilled platypus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01875951\"]}");
	add("{\"term\":\"duckboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03257890\"]}");
	add("{\"term\":\"ducking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00278413\", \"00454420\"]}");
	add("{\"term\":\"ducking stool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149648\"]}");
	add("{\"term\":\"duckling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01849811\", \"07662327\"]}");
	add("{\"term\":\"duckpin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03257982\"]}");
	add("{\"term\":\"duckpins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00463618\"]}");
	add("{\"term\":\"ducks and drakes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00460906\"]}");
	add("{\"term\":\"duckweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814988\"]}");
	add("{\"term\":\"duckweed family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814736\"]}");
	add("{\"term\":\"ducky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011405\"]}");
	add("{\"term\":\"duct\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03258101\", \"13111816\", \"05258141\"]}");
	add("{\"term\":\"duct gland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05336415\"]}");
	add("{\"term\":\"duct tape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03258219\"]}");
	add("{\"term\":\"ductileness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05029339\"]}");
	add("{\"term\":\"ductility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05029339\"]}");
	add("{\"term\":\"ductless gland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05337283\"]}");
	add("{\"term\":\"ductule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05259001\"]}");
	add("{\"term\":\"ductulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05259001\"]}");
	add("{\"term\":\"ductus arteriosus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05425521\"]}");
	add("{\"term\":\"ductus deferens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05533826\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }