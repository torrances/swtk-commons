package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04065351\"]}");
	add("{\"term\":\"roma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08824749\", \"10173755\"]}");
	add("{\"term\":\"romaic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06989493\"]}");
	add("{\"term\":\"romaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07740237\"]}");
	add("{\"term\":\"roman\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06840553\", \"09736443\", \"09736329\"]}");
	add("{\"term\":\"romanal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06910752\"]}");
	add("{\"term\":\"romance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06380839\", \"06382890\", \"06976693\", \"05215690\", \"13954469\"]}");
	add("{\"term\":\"romanesque\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05851233\"]}");
	add("{\"term\":\"romani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10173755\"]}");
	add("{\"term\":\"romania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08831830\"]}");
	add("{\"term\":\"romanian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06981017\", \"09747627\"]}");
	add("{\"term\":\"romanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06237693\"]}");
	add("{\"term\":\"romanoff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08174571\", \"10557265\"]}");
	add("{\"term\":\"romanov\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08174571\", \"10557265\"]}");
	add("{\"term\":\"romans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06454833\"]}");
	add("{\"term\":\"romansh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06980848\"]}");
	add("{\"term\":\"romantic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10557463\", \"10557379\"]}");
	add("{\"term\":\"romanticisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01221796\"]}");
	add("{\"term\":\"romanticism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05215690\", \"06164599\", \"05160149\"]}");
	add("{\"term\":\"romanticist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10557463\", \"10599128\"]}");
	add("{\"term\":\"romanticization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01221796\"]}");
	add("{\"term\":\"romany\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06982496\", \"10173755\"]}");
	add("{\"term\":\"romberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11289357\"]}");
	add("{\"term\":\"rome\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08102450\", \"08824749\"]}");
	add("{\"term\":\"romeo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10557639\"]}");
	add("{\"term\":\"rommany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10173755\"]}");
	add("{\"term\":\"rommel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11289505\"]}");
	add("{\"term\":\"romneya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11928023\"]}");
	add("{\"term\":\"romp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00512828\", \"10734679\", \"07490247\"]}");
	add("{\"term\":\"romper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04111864\", \"10557711\"]}");
	add("{\"term\":\"romulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09579434\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }