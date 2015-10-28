package org.swtk.commons.dict.wordnet.indexbyname.instance.b.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bed\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02822832\", \"02823016\", \"03655499\", \"08676707\", \"09240774\", \"09240545\", \"02822609\", \"02821967\"]}");
	add("{\"term\":\"beda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10860365\"]}");
	add("{\"term\":\"bedbug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02243169\"]}");
	add("{\"term\":\"bedchamber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02824762\"]}");
	add("{\"term\":\"bedclothes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02823345\"]}");
	add("{\"term\":\"bedcover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825355\"]}");
	add("{\"term\":\"bedder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13104221\"]}");
	add("{\"term\":\"bedding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02823567\", \"02823345\"]}");
	add("{\"term\":\"bede\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10860365\"]}");
	add("{\"term\":\"bedesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09864306\"]}");
	add("{\"term\":\"bedevilment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00426281\"]}");
	add("{\"term\":\"bedfellow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09865673\", \"09865763\"]}");
	add("{\"term\":\"bedframe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825721\"]}");
	add("{\"term\":\"bedground\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08516385\"]}");
	add("{\"term\":\"bedlam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02823933\", \"13999769\"]}");
	add("{\"term\":\"bedlamite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10296639\"]}");
	add("{\"term\":\"bedouin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09865877\"]}");
	add("{\"term\":\"bedpan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02824337\"]}");
	add("{\"term\":\"bedpost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02824550\"]}");
	add("{\"term\":\"bedrest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01066392\"]}");
	add("{\"term\":\"bedrock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05879984\", \"09240951\"]}");
	add("{\"term\":\"bedroll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02824678\"]}");
	add("{\"term\":\"bedroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02824762\"]}");
	add("{\"term\":\"bedside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08667286\"]}");
	add("{\"term\":\"bedsit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825199\"]}");
	add("{\"term\":\"bedsitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825199\"]}");
	add("{\"term\":\"bedsore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14235608\"]}");
	add("{\"term\":\"bedspread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825355\"]}");
	add("{\"term\":\"bedspring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825534\"]}");
	add("{\"term\":\"bedstead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02825721\"]}");
	add("{\"term\":\"bedstraw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12685809\"]}");
	add("{\"term\":\"bedtime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15193522\"]}");
	add("{\"term\":\"beduin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09865877\"]}");
	add("{\"term\":\"bedwetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09865994\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }