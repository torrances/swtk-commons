package org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07696677\"]}");
	add("{\"term\":\"buna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15032370\"]}");
	add("{\"term\":\"bunce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07492727\"]}");
	add("{\"term\":\"bunch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07971317\", \"08290764\", \"07976557\"]}");
	add("{\"term\":\"bunchberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12969011\"]}");
	add("{\"term\":\"bunche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10890857\"]}");
	add("{\"term\":\"bunchgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12123993\"]}");
	add("{\"term\":\"bunco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00780744\"]}");
	add("{\"term\":\"buncombe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06624034\"]}");
	add("{\"term\":\"bundesbank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08369061\"]}");
	add("{\"term\":\"bundle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13271579\", \"02922798\", \"08024575\"]}");
	add("{\"term\":\"bundling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00114774\", \"00323217\", \"07203639\"]}");
	add("{\"term\":\"bunfight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07462832\"]}");
	add("{\"term\":\"bung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02923032\"]}");
	add("{\"term\":\"bungalow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02923176\"]}");
	add("{\"term\":\"bungarus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01753561\"]}");
	add("{\"term\":\"bungee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02923274\"]}");
	add("{\"term\":\"bunghole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02923360\", \"05545848\"]}");
	add("{\"term\":\"bungle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00075610\"]}");
	add("{\"term\":\"bungler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09899210\"]}");
	add("{\"term\":\"bunion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14339779\"]}");
	add("{\"term\":\"bunk\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02923643\", \"06619692\", \"06624034\", \"02923467\", \"02834929\", \"02923548\"]}");
	add("{\"term\":\"bunker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02923887\", \"02924042\", \"02923753\"]}");
	add("{\"term\":\"bunkmate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09899541\"]}");
	add("{\"term\":\"bunko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00780744\"]}");
	add("{\"term\":\"bunkum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06624034\"]}");
	add("{\"term\":\"bunny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02327239\", \"09899655\"]}");
	add("{\"term\":\"buns\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05566889\"]}");
	add("{\"term\":\"bunsen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02924413\", \"10891011\"]}");
	add("{\"term\":\"bunt\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13089015\", \"13089194\", \"14307528\", \"00129297\"]}");
	add("{\"term\":\"buntal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14891841\"]}");
	add("{\"term\":\"bunter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09899804\"]}");
	add("{\"term\":\"bunting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01539775\", \"02924579\"]}");
	add("{\"term\":\"bunuel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10891242\"]}");
	add("{\"term\":\"bunyan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09614329\", \"10891343\"]}");
	add("{\"term\":\"bunyaviridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01333986\"]}");
	add("{\"term\":\"bunyavirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01334163\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }