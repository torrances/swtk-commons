package org.swtk.commons.dict.wiktionary.generated.f.a.f;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFAF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("faff", "{\"term\":\"faff\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Dialect, \u0026quot;blow in gusts.\u0026quot;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unnecessary or over-complicated task, especially one perceived as a waste of time\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Adjusting this television is a bit of a \u0027\u0027faff\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Patrick Kingsley, \u0026quot;[http://www.guardian.co.uk/uk/2011/jun/13/queenmother Life with the Queen Mum revealed]\u0026quot;, \u0027The Guardian\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Breakfast in bed at the royal household is a massive \u0027\u0027faff\u0027\u0027. A page boy must carry the tray upstairs, but he\u0027s banned from actually serving it. So he leaves it on the floor by the bedroom door, whereupon a housemaid picks it up and knocks on said portal\", \"priority\":4}]}, \"synonyms\":{}}");

	add("fafia", "{\"term\":\"fafia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{acronym of|forced|Forced away|Away from|From it|It all|All|lang\u003den}} After \u0027gafia\u0027 (Getting Away From It All). Used in early science fiction fandom.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of exiting or becoming inactive in fandom due to other obligations\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Just a quick note that AOL has once again stopped sending me newsgroup postings. Not sure why, and not sure when they will resume again. But \u0027\u0027FAFIA\u0027\u0027 for the moment\", \"priority\":2}]}, \"synonyms\":{}}");

	add("fafiation", "{\"term\":\"fafiation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|FAFIA|tion|gloss1\u003dforced away from it all|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of fafiating; exiting involvement in fandom due to other obligations\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Having dropped back into rasff for a bit, I\u0027m now dropping out again. Fall semester has started, and even with lots of filtering and aggressive ignoring of political threads, being a full-time parent and half-time graduate student doesn\u0027t leave time for Usenet. Even with three free mornings a week while Joseph\u0027s in pre-school\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The state or result of having fafiated; having exited fandom due to other obligations\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Something happened to this newsgroup during my \u0027\u0027fafiation\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"I\u0027m afraid that I\u0027ve never met his second wife, Laura Brodian, as (like so many medical fen) I suffered \u0027\u0027FAFIAtion\u0027\u0027 when I got stuck into building my practice\", \"priority\":5}]}, \"synonyms\":{}}");

	add("fafrotskies", "{\"term\":\"fafrotskies\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Condensation of \u0027falls from the skies\u0027, term coined by cryptozoologist Wikipedia:Ivan T. Sanderson|Ivan T. Sanderson.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Precipitation of objects from the sky that are not normally expected e.g. frogs, fish, coins etc\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }