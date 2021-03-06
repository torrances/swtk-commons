package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dusanbe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043683\"]}");
	add("{\"term\":\"duse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10966473\"]}");
	add("{\"term\":\"dushanbe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09043683\"]}");
	add("{\"term\":\"dusicyon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02118731\"]}");
	add("{\"term\":\"dusicyon cancrivorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02118837\"]}");
	add("{\"term\":\"dusk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15194468\"]}");
	add("{\"term\":\"duskiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04985483\", \"14008808\"]}");
	add("{\"term\":\"dusky salamander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01639470\"]}");
	add("{\"term\":\"dusky shark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01493001\"]}");
	add("{\"term\":\"dusseldorf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08790500\"]}");
	add("{\"term\":\"dust\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14864262\", \"14882048\", \"14864016\"]}");
	add("{\"term\":\"dust bag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03262895\"]}");
	add("{\"term\":\"dust bowl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08595702\"]}");
	add("{\"term\":\"dust cloud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11462076\"]}");
	add("{\"term\":\"dust coat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263433\"]}");
	add("{\"term\":\"dust contamination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00278111\", \"14511486\"]}");
	add("{\"term\":\"dust cover\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03263159\", \"03263280\", \"07262988\"]}");
	add("{\"term\":\"dust devil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11468350\"]}");
	add("{\"term\":\"dust jacket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07262988\"]}");
	add("{\"term\":\"dust mop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263608\"]}");
	add("{\"term\":\"dust sheet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263280\"]}");
	add("{\"term\":\"dust storm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11468490\"]}");
	add("{\"term\":\"dust wrapper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07262988\"]}");
	add("{\"term\":\"dustbin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750182\"]}");
	add("{\"term\":\"dustcart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03421952\"]}");
	add("{\"term\":\"dustcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263033\"]}");
	add("{\"term\":\"duster\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00108901\", \"03263033\", \"03263433\", \"11468490\"]}");
	add("{\"term\":\"dustin hoffman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11074437\"]}");
	add("{\"term\":\"dustiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14522317\"]}");
	add("{\"term\":\"dusting powder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04454410\"]}");
	add("{\"term\":\"dustman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139987\"]}");
	add("{\"term\":\"dustmop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263608\"]}");
	add("{\"term\":\"dustpan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03263712\", \"13789182\"]}");
	add("{\"term\":\"dustpanful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13789182\"]}");
	add("{\"term\":\"dustrag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263033\"]}");
	add("{\"term\":\"dustup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07198809\"]}");
	add("{\"term\":\"dusty miller\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"11832563\", \"11951781\", \"11968098\", \"12032089\", \"12043876\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }