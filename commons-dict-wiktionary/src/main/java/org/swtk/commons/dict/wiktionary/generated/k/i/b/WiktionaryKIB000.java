package org.swtk.commons.dict.wiktionary.generated.k.i.b;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kibe", "{\"term\":\"kibe\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Origin unknown.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a chilblain or ulcer, especially on the heel of the foo\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1602\u0027\u0027 : w:William William Shakespeare, Hamlet\u0027 , act V scene\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"By the Lord, Horatio, this three years I have took note of it, the age is grown so picked that the toe of the peasant comes so near the heel of the courtier he galls his \u0027\u0027kibe\", \"priority\":3}]}, \"synonyms\":{}}");

	add("kibs", "{\"term\":\"kibs\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Knowledge intensive business services\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Kentucky industrialized building system\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A \u0027\u0027KIBS\u0027\u0027 (Kentucky Industrialized Building System) unit is any “building” or “structure” manufactured or constructed off-site by a manufacturer and inspected by an approved third-party inspector or inspection agency during construction at the manufacturer’s site. This may include prefabricated units, modular units and equipment shelters. \u0027 Kentucky Department of Housing, Buildings and Construction\", \"priority\":3}]}, \"synonyms\":{}}");

	add("kibbeh", "{\"term\":\"kibbeh\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027كِبَّة\u0027 (ball) and \u0027كُبَّة\u0027 ((same))\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of dumpling, from the Levant, made of spiced lamb and bulgur wheat\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kibbutz", "{\"term\":\"kibbutz\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hebrew\"], \"text\":\"From Hebrew \u0027קִבּוּץ\u0027 derived from the radix \u0027קבץ\u0027 (tr\u003dkavatz)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A community, usually an agricultural one, based on a high level of social and economical sharing, equality, direct democracy and tight social relations\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kibosh", "{\"term\":\"kibosh\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Irish\", \"Hebrew\", \"scots\", \"Turkish\"], \"text\":\"{{unk.|en}}. Possibilities include:* From the Irish \u0027caidhp bháis,\u0027 meaning \u0027death cap\u0027 (the hood put on someone before they were hang|hanged to death, or the \u0026quot;Black cap\u0026quot; worn by English judges when pronouncing the death sentence).* From the Scots \u0027kye booties,\u0027 meaning \u0027cow boots\u0027 (the hobble put on cattle to prevent them from straying).* {{rfv-etymology|lang\u003den}} From the Hebrew כבש, (\u0027kbsh\u0027) meaning \u0027conquer\u0027 or \u0027tread down\u0027.* {{rfv-etymology|lang\u003den}} From the Hebrew חבש, (\u0027khbsh\u0027) meaning \u0027to bind\u0027 or \u0027to imprison\u0027.* {{rfv-etymology|lang\u003den}} Some connection with Turkish \u0027\u0027boş\u0027 meaning \u0027empty\u0027 (borrowed as English \u0027bosh\u0027 .Compare {{m|en|bosh||nonsense}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Nonsense, bosh\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A checking or restraining element\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Fashion; style. \u0026lt;!--Webster 1913--\u0026gt\", \"priority\":3}]}, \"synonyms\":{}}");

	add("kibozer", "{\"term\":\"kibozer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|kiboze|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who kibozes; one who searches for references to his/her own name in order to post follow-ups\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kibun", "{\"term\":\"kibun\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"face; dignity; prestige\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }