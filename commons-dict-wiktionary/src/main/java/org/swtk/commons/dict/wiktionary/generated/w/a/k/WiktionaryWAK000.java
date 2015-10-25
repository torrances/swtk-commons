package org.swtk.commons.dict.wiktionary.generated.w.a.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("waka", "{\"term\":\"waka\", \"etymology\":{\"influencers\":[], \"languages\":[\"Aymara\", \"Spanish\"], \"text\":\"From Spanish \u0027vaca\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"work; labor; job\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wake", "{\"term\":\"wake\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1838\u0027\u0027, \u0027The Law Journal Reports\u0027 (volume 7, page 93\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The testator, in this cause, devised and bequeathed an equal fifth part of his real estate, and of his residuary personal estate, to the plaintiff Mrs. \u0027\u0027Wake\u0027\u0027, the wife of the plaintiff Mr. \u0027\u0027Wake\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An island in Micronesia, administered by the Office of Insular Affairs of the United States Department of the Interior and used solely by the United States Air Force\", \"priority\":3}]}, \"synonyms\":{}}");

	add("wakame", "{\"term\":\"wakame\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|ja|若布||tr\u003dwakame|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an edible seaweed.Category:en:AlgaeCategory:en:FoodsCategory:en:Brown algae\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wakey", "{\"term\":\"wakey\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|wake|y|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The day on which one wakes up and travels home\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Gary Blinco, \u0027Down a Country Lane\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"You beauty, only 364 and a \u0027\u0027wakey\u0027\u0027 to go,\u0027 the countdown had begun and would continue, as few days passed without someone calling the time. I spared a thought for our temporary enemy whose tour would endure to the end of the wa\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Ian McGibbon, \u0027New Zealand\u0027s Vietnam War\u0027 (page 542\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Morale was also usually high, helped by the men\u0027s recognition that their service in Vietnam had strict limits – one year, or, to use a soldiers\u0027 expression of the time, 364 days and a \u0027\u0027wakey\u0027\u0027 (the day the men woke to prepare to fly out\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Richard \u0026quot;Barney\u0026quot; Bigwood, \u0027We Were Reos: Australian Infantry Reinforcements in VIETNAM\u0027 (page 47\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"When you became a \u0027short timer\u0027 (20 days and a \u0027\u0027wakey\u0027\u0027) you delighted in sticking it up to the new arrivals\", \"priority\":7}]}, \"synonyms\":{}}");

	add("wakeboard", "{\"term\":\"wakeboard\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|wake|board|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The board one stands on for wakeboarding\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wakeboarding", "{\"term\":\"wakeboarding\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A water sport where a rider on a small board is towed by a motor boat, and attached by a cable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wakefulness", "{\"term\":\"wakefulness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|wakeful|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being wakeful\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wakeover", "{\"term\":\"wakeover\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|wake|over|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sleepover party in a public place, such as a church, at which little or no sleep actually gets done\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The youth group will have another \u0027\u0027wakeover\u0027\u0027 this weekend\", \"priority\":2}]}, \"synonyms\":{}}");

	add("wakizashi", "{\"term\":\"wakizashi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027lang\u003dja\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Japanese short sword, often used as a secondary weapon to a katana\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }