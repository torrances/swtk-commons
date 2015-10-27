package org.swtk.commons.dict.wordnet.index.byid.instance.p0.p0;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexIdInstance0000 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("00001740", "{\"term\":\"entity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00001740\"]}");
	add("00001930", "{\"term\":\"physical entity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00001930\"]}");
	add("00002137", "{\"term\":\"abstract entity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00002137\"]}");
	add("00002137", "{\"term\":\"abstraction\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00002137\", \"05708590\", \"02671631\", \"05788101\", \"00393656\", \"05862715\"]}");
	add("00002452", "{\"term\":\"thing\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"00002452\", \"07495496\", \"05993067\", \"04624646\", \"04431553\", \"06736657\", \"05679169\", \"07304554\", \"04431353\", \"05863569\", \"00034778\", \"13967020\"]}");
	add("00002684", "{\"term\":\"object\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06142175\", \"05818974\", \"06321227\", \"05990115\", \"00002684\"]}");
	add("00002684", "{\"term\":\"physical object\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00002684\"]}");
	add("00003553", "{\"term\":\"unit\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00003553\", \"09488589\", \"05878479\", \"08206589\", \"13832535\", \"13604927\"]}");
	add("00003553", "{\"term\":\"whole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00003553\", \"05878206\"]}");
	add("00003993", "{\"term\":\"congener\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00003993\", \"01330943\", \"14825012\"]}");
	add("00004258", "{\"term\":\"animate thing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00004258\"]}");
	add("00004258", "{\"term\":\"living thing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00004258\"]}");
	add("00004475", "{\"term\":\"being\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00004475\", \"13977471\"]}");
	add("00004475", "{\"term\":\"organism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08453046\", \"00004475\"]}");
	add("00005787", "{\"term\":\"benthos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00005787\", \"08596045\"]}");
	add("00005930", "{\"term\":\"dwarf\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00005930\", \"09564236\", \"10060141\"]}");
	add("00006024", "{\"term\":\"heterotroph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00006024\"]}");
	add("00006150", "{\"term\":\"parent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00006150\", \"10419190\"]}");
	add("00006269", "{\"term\":\"life\", \"synsetCount\":14, \"upperType\":\"NOUN\", \"ids\":[\"15249872\", \"09201624\", \"06527818\", \"11493691\", \"00006269\", \"04639514\", \"10280403\", \"15165852\", \"15165704\", \"15165365\", \"13984978\", \"13984685\", \"05818587\", \"13986528\"]}");
	add("00006400", "{\"term\":\"biont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00006400\"]}");
	add("00006484", "{\"term\":\"cell\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02994757\", \"02995010\", \"02995984\", \"08375521\", \"02994503\", \"00006484\", \"02995166\"]}");
	add("00007347", "{\"term\":\"causal agency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007347\"]}");
	add("00007347", "{\"term\":\"causal agent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007347\"]}");
	add("00007347", "{\"term\":\"cause\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01185144\", \"00007347\", \"00799906\", \"06753097\", \"07341157\"]}");
	add("00007846", "{\"term\":\"individual\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10223458\", \"00007846\"]}");
	add("00007846", "{\"term\":\"mortal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007846\"]}");
	add("00007846", "{\"term\":\"person\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06337790\", \"05224944\", \"00007846\"]}");
	add("00007846", "{\"term\":\"somebody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007846\"]}");
	add("00007846", "{\"term\":\"someone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00007846\"]}");
	add("00007846", "{\"term\":\"soul\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07076008\", \"00934969\", \"07495930\", \"00007846\", \"10646444\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }